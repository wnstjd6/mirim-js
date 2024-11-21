function solution(num_list) {
    let answer = [];
    let j = 0;
    for(let i = num_list.length-1; i>=0; i--){
        answer[j] = num_list[i];
        j++;
    }
    return answer;
}