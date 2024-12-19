function solution(order) {
    let answer = 0;
    for (let i = 0; i < order.length; i++) {
        if (order[i].includes("americano")) {
          answer+=4500;
        } else if (order[i].includes("cafelatte")) {
            answer+=5000;
        } else {
            answer += 4500; 
        }
    }
    return answer;
}
