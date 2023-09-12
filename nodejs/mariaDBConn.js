// db
const mariadb = require("mariadb");
const cfg = require("./conf");
let no = 1;

const pool = mariadb.createPool({
    host:cfg.host,
    post:cfg.port,
    user:cfg.user,
    password:cfg.pass,
    connectionLimit:cfg.connectionLimit
})

async function GetSampleList() {
    let conn, rows;
    try{
        conn = await pool.getConnection();
        conn.query('USE teaspoon');
        rows = await conn.query('select * from sample');
    } catch(err) {
        throw err
    } finally {
        if(conn) conn.end();
        return rows;
    }
}

async function GetSample() {
    let conn, rows;
    try{
        conn = await pool.getConnection();
        conn.query('USE teaspoon');
        rows = await conn.query(`select * from sample where no=${no}`) // 하나만 출력
    } catch(err) {
        throw err
    } finally {
        if(conn) conn.end();
        return rows;
    }
}

async function DeleteSample() {
    let conn, rows;
    try{
        conn = await pool.getConnection();
        conn.query('USE teaspoon');
        rows = await conn.query(`delete from sample where no=${no}`) // 하나만 출력
    } catch(err) {
        throw err
    } finally {
        if(conn) conn.end();
        return rows;
    }
}

async function InsertSample(sample) {
    let conn, name, sql;
    name = sample
    try{
        conn = await pool.getConnection();
        conn.query('USE teaspoon');
        await conn.query(`insert into sample values(default, ?)`, name) // 하나만 출력
        msg = `${name} 추가 성공`
    } catch(err) {
        msg = '추가 실패'
        throw err
    } finally {
        if(conn) conn.end();
        return msg;
    }
}

async function UpdateSample(sample) {
    let conn, msg, sql;
    try{
        conn = await pool.getConnection();
        conn.query('USE teaspoon');
        await conn.query(`update sample set name=? where no=?`, sample) // 하나만 출력
        msg = `${sample[1]} 수정 성공`
    } catch(err) {
        msg = '수정 실패'
        throw err
    } finally {
        if(conn) conn.end();
        return msg;
    }
}

module.exports = { insertSample:InsertSample, deleteSample:DeleteSample, 
    getSample:GetSample, getSampleList:GetSampleList, updateSample:UpdateSample}

