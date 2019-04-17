package cn.java.collection.demo;

import java.util.Map;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/**
 * google API:ImmutableCollection is final object,cannot be modified after it hava been created
 *
 */
public class FinalCollectionDemo
{
    private static final ImmutableList<Integer> list = ImmutableList.of(1, 2, 3);  // 这样被初始化之后 list是不能被改变
    private static final ImmutableSet set = ImmutableSet.copyOf(list); // 这样被初始化之后set是不能被改变的
    private static final  ImmutableMap<Integer, String> map = ImmutableMap.of(1, "a", 2, "b", 3, "c", 4, "d");

    public static void main(String[] args) {
//        list.add(123);
//        set.add(222);
        map.put(1, "a1");
    }
    
}
