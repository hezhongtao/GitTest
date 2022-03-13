package com.gongsi.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		List<String> asList = Arrays.asList("3","4");
		Map<String, String> collect = asList.stream().collect(Collectors.toMap(p->p, p -> p+"value", (p, p2) -> p));
		
		Map<String, String> collect2 = asList.stream().collect(Collectors.toMap(p->collect.get(p), p -> p, (p, p2) -> p));
		
		System.out.println(collect);
		
		collect.keySet().stream().forEach(p -> System.out.println(p + ":" + collect.get(p)));
		
		collect2.keySet().stream().forEach(p -> System.out.println(p + ":" + collect2.get(p) ));
		
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("E:\\1.txt")));
		
		bufferedReader.lines().forEach(line -> System.out.println(line));
		
		List<String> collect3 = asList.stream().filter(p -> p.endsWith("dd")).collect(Collectors.toList());
		
		System.out.println(collect3);
		List<String> asList1 = null;
		
		asList1.stream().count();
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
