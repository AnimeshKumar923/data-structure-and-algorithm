function bubbleSort(arr){
  for (let i = arr.length - 1; i >= 1; i--) {
    let isSwapped = false;
    for(let j = 0; j <= i - 1; j++){
      if(arr[j] > arr[j + 1]){
        let temp = arr[j + 1];
        arr[j + 1] = arr[j];
        arr[j] = temp;
        isSwapped = true;
      }
    }
    if(isSwapped === false){
      break;
    }
  }
  return arr;
}

let arr1 = [13, 46, 24, 52, 20, 9];
console.log(arr1);
console.log(bubbleSort(arr1));