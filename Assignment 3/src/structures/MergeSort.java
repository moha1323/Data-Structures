package structures;

import interfaces.IndexableList;
import interfaces.Iterator;
import sortspecs.SortMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSort implements SortMethod{
    IndexableList indexableList;
    LinkedList linkedList;
    MergeSort ms = new MergeSort();

    public MergeSort() {
        sort();
    }

    public MergeSort(IndexableList indexableList){
        this.indexableList = indexableList;
    }

    public MergeSort(LinkedList linkedList){
        this.linkedList = linkedList;
    }

    public IndexableList mergeSort(){

        if(indexableList.size () <= 1){
            return indexableList;
        }
        int headMidpoint = indexableList.size() / 2;
        int tailMidpoint;

        if(indexableList.size() % 2 == 0){
            tailMidpoint = headMidpoint;
        } else {
            tailMidpoint = headMidpoint + 1;
        }

        IndexableList left = new IndexableList () {
            List left;

            @Override
            public Object get(int index) {
                return left.get(index);
            }

            @Override
            public void set(int index, Object newElement) {
                left.set(index,newElement);
            }

            @Override
            public void add(Object newElement) {
                left.add(newElement);
            }

            @Override
            public void addAll(List newElements) {
                left.addAll(newElements);
            }

            @Override
            public Object remove(int index) {
                return left.remove(index);
            }

            @Override
            public void clear() {
                left.clear();
            }

            @Override
            public void shuffle() {
                Collections.shuffle(left);
            }

            @Override
            public void reverse() {
                Collections.reverse(left);
            }

            @Override
            public boolean isEmpty() {
                return left.isEmpty();
            }

            @Override
            public int size() {
                return left.size();
            }

            @Override
            public List asList() {
                return null;
            }

            @Override
            public int indexOf(Object anElement) {
                return 0;
            }

            @Override
            public boolean contains(Object anElement) {
                return false;
            }

            @Override
            public IndexableList copyFromTo(int startIndex, int stopIndex) {
                return null;
            }

            @Override
            public Iterator toBackwardIterator() {
                return null;
            }

            @Override
            public Iterator toIterator() {
                return null;
            }
        };
        IndexableList right = new IndexableList () {
            List right;

            @Override
            public Object get(int index) {
                return right.get(index);
            }

            @Override
            public void set(int index, Object newElement) {
                right.set(index,newElement);
            }

            @Override
            public void add(Object newElement) {
                right.add(newElement);
            }

            @Override
            public void addAll(List newElements) {
                right.addAll(newElements);
            }

            @Override
            public Object remove(int index) {
                return right.remove(index);
            }

            @Override
            public void clear() {
                right.clear();
            }

            @Override
            public void shuffle() {
                Collections.shuffle(right);
            }

            @Override
            public void reverse() {
                Collections.reverse(right);
            }

            @Override
            public boolean isEmpty() {
                return right.isEmpty();
            }

            @Override
            public int size() {
                return right.size();
            }

            @Override
            public List asList() {
                return null;
            }

            @Override
            public int indexOf(Object anElement) {
                return 0;
            }

            @Override
            public boolean contains(Object anElement) {
                return false;
            }

            @Override
            public IndexableList copyFromTo(int startIndex, int stopIndex) {
                return null;
            }

            @Override
            public Iterator toBackwardIterator() {
                return null;
            }

            @Override
            public Iterator toIterator() {
                return null;
            }
        };

        for(int i = 0; i < headMidpoint; i++){
            left.add(indexableList.get(i));
        }

        for(int j = 0; j < tailMidpoint; j++){
            right.add(indexableList.get(tailMidpoint + j));
        }

        IndexableList result = new IndexableList () {
            List result;

            @Override
            public Object get(int index) {
                return result.get(index);
            }

            @Override
            public void set(int index, Object newElement) {
                result.set(index,newElement);
            }

            @Override
            public void add(Object newElement) {
                result.add(newElement);
            }

            @Override
            public void addAll(List newElements) {
                result.addAll(newElements);
            }

            @Override
            public Object remove(int index) {
                return result.remove(index);
            }

            @Override
            public void clear() {
                result.clear();
            }

            @Override
            public void shuffle() {
                Collections.shuffle(result);
            }

            @Override
            public void reverse() {
                Collections.reverse(result);
            }

            @Override
            public boolean isEmpty() {
                return result.isEmpty();
            }

            @Override
            public int size() {
                return result.size();
            }

            @Override
            public List asList() {
                return null;
            }

            @Override
            public int indexOf(Object anElement) {
                return 0;
            }

            @Override
            public boolean contains(Object anElement) {
                return false;
            }

            @Override
            public IndexableList copyFromTo(int startIndex, int stopIndex) {
                return null;
            }

            @Override
            public Iterator toBackwardIterator() {
                return null;
            }

            @Override
            public Iterator toIterator() {
                return null;
            }
        };

        left = mergeSort();
        right = mergeSort();

        result = merge(left,right);

        return result;
    }

    public IndexableList merge(IndexableList left, IndexableList right){

        IndexableList result = new IndexableList () {
            List result;

            @Override
            public Object get(int index) {
                return result.get(index);
            }

            @Override
            public void set(int index, Object newElement) {
                result.set(index,newElement);
            }

            @Override
            public void add(Object newElement) {
                result.add(newElement);
            }

            @Override
            public void addAll(List newElements) {
                result.addAll(newElements);
            }

            @Override
            public Object remove(int index) {
                return result.remove(index);
            }

            @Override
            public void clear() {
                result.clear();
            }

            @Override
            public void shuffle() {
                Collections.shuffle(result);
            }

            @Override
            public void reverse() {
                Collections.reverse(result);
            }

            @Override
            public boolean isEmpty() {
                return result.isEmpty();
            }

            @Override
            public int size() {
                return result.size();
            }

            @Override
            public List asList() {
                return null;
            }

            @Override
            public int indexOf(Object anElement) {
                return 0;
            }

            @Override
            public boolean contains(Object anElement) {
                return false;
            }

            @Override
            public IndexableList copyFromTo(int startIndex, int stopIndex) {
                return null;
            }

            @Override
            public Iterator toBackwardIterator() {
                return null;
            }

            @Override
            public Iterator toIterator() {
                return null;
            }
        };

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        while(leftPointer < left.size() || rightPointer < right.size()){
            if(leftPointer < left.size() && rightPointer < right.size()){
                if((Integer)left.get(leftPointer) < (Integer)right.get(rightPointer)){
                    result.set(resultPointer++,left.get(leftPointer++));
                } else {
                    result.set(resultPointer++,right.get(rightPointer++));
                }
            } else if(leftPointer < left.size()){
                result.set(resultPointer++,left.get(leftPointer++));
            } else if(rightPointer < left.size()){
                result.set(resultPointer++,right.get(rightPointer++));
            }
        }
        return result;
    }

    public void displayAllIndeaxableList() {
        for(int i = 0; i < indexableList.size(); i++){
            System.out.println (indexableList.get(i));
        }
    }

    @Override
    public void sort() {
        ms.mergeSort();
    }

    @Override
    public List getSortedResult() {
        List result = new ArrayList ();
        for(int i = 0; i < indexableList.size (); i++){
            result.add(indexableList.get(i));
            System.out.println (indexableList.get(i));
        }
        for(int i = 0; i < linkedList.size (); i++){
            result.add(linkedList.get(i));
            System.out.println (linkedList.get(i));
        }
        return result;
    }
}
