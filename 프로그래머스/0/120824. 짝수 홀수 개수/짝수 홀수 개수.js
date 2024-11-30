function solution(num_list) {
    var answer = [];
    let a = 0;
    let b = 0;
    for(let  i = 0; i<num_list.length; i++){
        if(num_list[i]%2==0){
            a++;
        }
        else{
            b++;
        }
    }
    answer =[a,b]
    return answer;
}