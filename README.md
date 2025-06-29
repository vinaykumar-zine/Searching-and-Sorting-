# README.md

## 📚 Overview

This project demonstrates various fundamental **searching**, **sorting**, and **linked list** based data structures in Java. It includes:

- Linear Search
- Binary Search
- Bubble Sort
- Insertion Sort
- Merge Sort
- Quick Sort
- Selection Sort
- Doubly Linked List
- Stack (using Linked List)
- Queue (using Linked List)

Each implementation is built with clarity for learning and extension.

---

## 🔍 Searching Algorithms

### 1. **Linear Search**

- Iterates through each element in the array.
- Compares each element with the target.
- **Time Complexity**: O(n)

```java
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == elem) return true;
}
```

---

### 2. **Binary Search**

- Works only on **sorted arrays**.
- Uses two pointers (left and right) and a mid-point.
- Reduces search space by half every iteration.
- **Time Complexity**: O(log n)

```java
while (left <= right) {
    mid = (left + right) / 2;
    if (arr[mid] == elem) return true;
    else if (arr[mid] < elem) left = mid + 1;
    else right = mid - 1;
}
```

---

## 🔃 Sorting Algorithms

### 1. **Bubble Sort**

- Repeatedly swaps adjacent elements if they are in the wrong order.
- Inefficient for large datasets.
- **Time Complexity**: O(n^2)

```java
for (int i = 0; i < arr.length; i++) {
    for (int j = 1; j < arr.length; j++) {
        if (arr[j] < arr[j - 1]) swap(j, j - 1);
    }
}
```

---

### 2. **Insertion Sort**

- Builds the final sorted array one item at a time.
- Shifts larger values one position to the right to insert the current element.
- **Time Complexity**: O(n^2)

```java
for (int i = 1; i < arr.length; i++) {
    int key = arr[i];
    int j = i - 1;
    while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
    }
    arr[j + 1] = key;
}
```

---

### 3. **Merge Sort**

- Divide and conquer algorithm.
- Splits array into halves, recursively sorts, and then merges.
- **Time Complexity**: O(n log n)

```java
mergeSort(left, mid);
mergeSort(mid + 1, right);
mergeArr(left, mid, right);
```

---

### 4. **Quick Sort**

- Picks a pivot, places it in its correct position, and recursively sorts subarrays.
- **Time Complexity**: Average case O(n log n), Worst case O(n^2)

```java
if (l < r) {
    int pivot = placeThePivotAtCorrectSpot(l, r);
    sort(l, pivot - 1);
    sort(pivot + 1, r);
}
```

---

### 5. **Selection Sort**

- Repeatedly selects the smallest remaining element and swaps it.
- **Time Complexity**: O(n^2)

```java
for (int i = 0; i < arr.length; i++) {
    for (int j = i; j < arr.length; j++) {
        if (arr[j] < arr[i]) swap(i, j);
    }
}
```

---

## 🔗 Linked List

### 1. **Doubly Linked List**

- Each node contains data, next, and previous pointers.
- Supports forward and backward traversal.

#### Methods:

- `addElem(int val)` – Adds an element to the end.
- `printList()` – Prints elements from head to tail.
- `printRevList()` – Prints elements from tail to head.

```java
head -> 10 -> 20 -> 30 -> Null
Null <- 30 <- 20 <- 10 <- head
```

---

## 📦 Stack (using Linked List)

### LIFO (Last-In-First-Out)

#### Operations:

- `push(int val)` – Add element to the top.
- `pop()` – Remove and return top element.
- `peek()` – Return top element without removing.

```java
Node top;

push(val): insert at head.
pop(): remove from head.
```

---

## 📬 Queue (using Linked List)

### FIFO (First-In-First-Out)

#### Operations:

- `enqueue(int val)` – Add element at the end.
- `dequeue()` – Remove and return front element.
- `peek()` – Return front element without removing.

```java
Node front, rear;

enqueue(val): insert at rear.
dequeue(): remove from front.
```

---

## 📁 Folder Structure

```
com/
├── searching/
│   ├── LinearSearch.java
│   └── BinarySearch.java
├── sorting/
│   ├── BubbleSort.java
│   ├── InsertionSort.java
│   ├── MergeSort.java
│   ├── QuickSort.java
│   └── SelectionSort.java
└── linkedlist/
    └── LinkedList.java
```

---

## 🧠 Conclusion

This project is ideal for beginners learning data structures and algorithms. Each class and method is crafted to show the **logic clearly and effectively**. You can further extend these implementations to include recursion, generics, and complex data structure problems.

