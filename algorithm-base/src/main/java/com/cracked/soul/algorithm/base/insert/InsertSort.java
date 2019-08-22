package com.cracked.soul.algorithm.base.insert;

/**
 * @author IronSoul
 */
public class InsertSort {

  public static int[] sort(int[] source) {
    int temp;
    int index;
    for (int i = 1; i < source.length; i++) {
      temp = source[i];
      index = i;
      //查找正确位置下标
      while (index > 0 && temp < source[index - 1]) {
        index--;
      }
      //复制数组往后挪到正确位置
      System.arraycopy(source, index, source, index + 1, i - index);
      //指定位置赋值
      source[index] = temp;
    }
    return source;
  }
}
