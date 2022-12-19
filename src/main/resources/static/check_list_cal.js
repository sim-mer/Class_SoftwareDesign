function count(type)  {
    // 결과를 표시할 element
    const resultElement = document.getElementById('total');
    
    // 현재 화면에 표시된 값
    let number = resultElement.innerText;

    console.log(number)
    
    // 더하기/빼기
    if(type === 1) {
      number = parseInt(number) + 1;
    }else if(type === 2) {
        number = parseInt(number) + 2;
    }else if(type === 3) {
        number = parseInt(number) + 3;
    }else if(type === 4) {
        number = parseInt(number) + 4;
    }else if(type === 5) {
        number = parseInt(number) + 5;
    }
    // 결과 출력
    resultElement.innerText = number;
  }