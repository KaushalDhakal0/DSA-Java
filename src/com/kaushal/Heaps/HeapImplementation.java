package com.kaushal.Heaps;

import java.util.ArrayList;
import java.util.List;

class PriorityQueue<E> {
    private List<Element<E>> heap;

    public PriorityQueue() {
        heap = new ArrayList<>();
    }

    public void enqueue(E item, int priority) {
        Element<E> element = new Element<>(item, priority);
        heap.add(element);
        heapifyUp();
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }

        if (heap.size() == 1) {
            return heap.remove(0).item;
        }

        Element<E> highestPriority = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        heapifyDown();
        return highestPriority.item;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return heap.get(0).item;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    private void heapifyUp() {
        int index = heap.size() - 1;
        Element<E> element = heap.get(index);
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            Element<E> parent = heap.get(parentIndex);
            if (element.priority >= parent.priority) {
                break;
            }
            heap.set(index, parent);
            index = parentIndex;
        }
        heap.set(index, element);
    }

    private void heapifyDown() {
        int index = 0;
        Element<E> element = heap.get(index);
        int length = heap.size();
        while (index < length) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallestChildIndex = -1;
            if (leftChildIndex < length) {
                Element<E> leftChild = heap.get(leftChildIndex);
                if (leftChild.priority < element.priority) {
                    smallestChildIndex = leftChildIndex;
                }
            }
            if (rightChildIndex < length) {
                Element<E> rightChild = heap.get(rightChildIndex);
                if ((smallestChildIndex == -1 && rightChild.priority < element.priority)
                        || (smallestChildIndex != -1 && rightChild.priority < heap.get(smallestChildIndex).priority)) {
                    smallestChildIndex = rightChildIndex;
                }
            }
            if (smallestChildIndex == -1) {
                break;
            }
            heap.set(index, heap.get(smallestChildIndex));
            index = smallestChildIndex;
        }
        heap.set(index, element);
    }

    private static class Element<E> {
        E item;
        int priority;

        Element(E item, int priority) {
            this.item = item;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.enqueue("Task 5", 5);
        priorityQueue.enqueue("Task 3", 3);
        priorityQueue.enqueue("Task 7", 7);
        priorityQueue.enqueue("Task 4", 4);
        priorityQueue.enqueue("Task 1", 1);
        priorityQueue.enqueue("Task 2", 2);
        priorityQueue.enqueue("Task 6", 6);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
    }
}
