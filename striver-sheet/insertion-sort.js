function insertionSort(arr){
  for (let i = 0; i <= arr.length - 1; i++) {
    let j = i;
    while(j > 0 && arr[j - 1] > arr[j]){
      let temp = arr[j - 1];
      arr[j - 1] = arr[j];
      arr[j] = temp;
      j--;
    }
  }
  return arr;
}

let arr1 = [13, 46, 24, 52, 20, 9];
console.log(arr1);
console.log(insertionSort(arr1));