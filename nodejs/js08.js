// 객체의 배열 : 배열 안에 객체
const ramenList = [
    {
        brand : '농심',
        items : ['신라면', '너구리', '짜파게티', '둥지냉면']
    },
    {
        brand : '오뚜기',
        items : ['진라면', '진짬뽕', '쇠고기미역국', '진비빔면']
    },
    {
        brand : '삼양',
        items : ['삼양라면', '불닭볶음면']
    },
    {
        brand : '팔도',
        items : []
    }
]

console.log(`구매 가능한   ${ramenList[0].brand}의 라면 : ${ramenList[0].items}`);
console.log(`구매 가능한 ${ramenList[1].brand}의 라면 : ${ramenList[1].items}`);
console.log(`구매 가능한   ${ramenList[2].brand}의 라면 : ${ramenList[2].items}`);
console.log(`구매 가능한   ${ramenList[3].brand}의 라면 : ${ramenList[3].items}`);
console.log();

var fn = function(strings, brand, items) {
    if(items === undefined || items == '') {
        return (brand + " 회사 라면 품절");
    } else {
        return (strings[0] + brand + strings[1] + items + strings[2]);
    }
}

for(var i=0; i<4; i++) {
    console.log(fn`구매 가능한 ${ramenList[i].brand}의 라면 : ${ramenList[i].items}`);
}