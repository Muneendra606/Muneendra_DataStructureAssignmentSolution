package com.muneendra.question1.servicce;

import java.util.PriorityQueue;
import java.util.Collections;
public class PriorityQueueImplementation {

	public static void main(String[] args) {
		
		PriorityQueue<Integer>queue= new PriorityQueue<>(Collections.reverseOrder());
		
		
		while(!queue.isEmpty()) {
			System.out.print(queue.poll()+" ");
		}

	}

}
