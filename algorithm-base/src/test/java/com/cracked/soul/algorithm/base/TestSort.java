package com.cracked.soul.algorithm.base;


import com.cracked.soul.algorithm.base.insert.InsertSort;
import java.util.Arrays;
import org.junit.Test;

public class TestSort {
  @Test
  public void testInsertSort(){
    int[] source=new int[]{3,5,1,6,8,4,2,9,7};
    System.out.println(Arrays.toString(InsertSort.sort(source)));
  }
}
