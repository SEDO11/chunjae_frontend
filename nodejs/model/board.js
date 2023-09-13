const mariadb = require("mariadb");
const cfg = require("../conf");

const pool = mariadb.createPool({
    host : cfg.host,
    port : cfg.port,
    user : cfg.user,
    password : cfg.pass,
    connectionLimit : cfg.connectionLimit
});

async function GetBoardList(){
    let conn, rows;
    try {
        conn = await pool.getConnection();
        conn.query('USE teaspoon');
        rows = await conn.query('select * from board');
    } catch(err) {
        throw err;
    } finally {
        if(conn) conn.end();
        return rows;
    }
}

async function GetBoardOne(no){
    let conn, row;
    try {
        conn = await pool.getConnection();
        conn.query('USE teaspoon');
        row = await conn.query(`select * from board where no = ${no}`);
    } catch(err) {
        throw err;
    } finally {
        if(conn) conn.end();
        return row;
    }
}

async function InsertBoard(nickname){
    let conn, msg, sql;
    try {
        conn = await pool.getConnection();
        conn.query('USE teaspoon');
        sql = `insert into board values(default, ?)`;
        await conn.query(sql, nickname);
        msg = "등록 성공";
    } catch(err) {
        msg = "등록 실패";
        throw err;
    } finally {
        if(conn) conn.end();
        return msg;
    }
}

async function DeleteBoard(no){
    let conn, msg, sql;
    try {
        conn = await pool.getConnection();
        conn.query('USE teaspoon');
        sql = `delete from board where no = ?`;
        await conn.query(sql, no);
        msg = "삭제 성공";
    } catch(err) {
        msg = "삭제 실패";
        throw err;
    } finally {
        if(conn) conn.end();
        return msg;
    }
}

async function UpdateBoard(board){
    let conn, sql, msg;
    try {
        conn = await pool.getConnection();
        conn.query('USE teaspoon');
        sql = `update board set name = ? where no = ?`;
        await conn.query(sql, board);
        msg = "수정 성공";
    } catch(err) {
        msg = "수정 실패";
        throw err;
    } finally {
        if(conn) conn.end();
        return msg;
    }
}

module.exports = {
    getBoardList : GetBoardList,
    getBoardOne : GetBoardOne,
    insertBoard : InsertBoard,
    deleteBoard : DeleteBoard,
    updateBoard : UpdateBoard
}