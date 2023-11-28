function solution(a, b) {
    var answer = 0;
    
    var result1 = (2*a*b);
    var result2 = a.toString()+b.toString()
    
    return Math.max(result1,Number(result2));

    
}