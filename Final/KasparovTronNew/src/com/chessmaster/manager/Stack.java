package com.chessmaster.manager;

import java.util.EmptyStackException;

public class Stack<T> {
private T[] array;
private int size;
private int index;

public Stack() {
	this.array=(T[]) new Object[index];
}
public void push(T pieace) {
	if(isFull()){
		throw new StackOverflowError("Stack is full");
	}
	array[index] = pieace;
	index++;
}
public T pop() {
	if(isEmpty()) {
		throw new EmptyStackException();
	}
	return array[index--];
	
}
public T peek() {
	if(!isEmpty()) {
		return array[index];
	}
	return null;
}

public boolean isEmpty() {
	if(index == 0) {
		return true;
	}
	return false;
}
public boolean isFull() {
	if(index == size) {
		return true;
	}
	return false;
}
public int size() {
	return index;
}
}