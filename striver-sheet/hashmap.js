const frequencyCount = new Map();

// Assuming 'data' is an array of numbers
const data = [1, 2, 2, 3, 3, 3, 4, 4, 4, 4];

data.forEach((num) => {
  const count = frequencyCount.get(num) || 0;
  frequencyCount.set(num, count + 1);
});

for (let index = 1; index < frequencyCount.length; index++) {
  console.log(frequencyCount.get(index));
  
}
// Output: Map {1 => 1, 2 => 2, 3 => 3, 4 => 4}
