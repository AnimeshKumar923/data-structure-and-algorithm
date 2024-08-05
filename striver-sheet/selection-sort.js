function selectionSort(arr){
  for (let i = 0; i <= arr.length - 2; i++) {
    let min = i;
    for(let j = i; j <= arr.length - 1; j++){
      if(arr[j] < arr[min]){
        min = j;
      }
    }
    let temp = arr[min];
    arr[min] = arr[i];
    arr[i] = temp;
  }
  return arr;
}

let arr1 = [13, 46, 24, 52, 20, 9];
console.log(arr1);
console.log(selectionSort(arr1));