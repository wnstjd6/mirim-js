function solution(s) {
    var answer = 0;
     s = s.split(" ");

    s.map((x, index) => {
    if (x == "Z") {
      s[index] = -s[index - 1];
    }
    });
    
    s.map((x)=>answer += parseInt(x));
    return answer;
}