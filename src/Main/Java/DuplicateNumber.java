package Main.Java;

import java.util.ArrayList;
import java.util.List;


    /*You have got a range of numbers between 1 to N, where one of the number is
    repeated. You need to write a program to find out the duplicate number.*/
    public class DuplicateNumber {
        public int findDuplicateNumber(List<Integer> numbers){
            int higestNr = numbers.size() -1 ;
            int total = getSum(numbers);
            int duplicate = total - (higestNr*(higestNr+1)/2);
            return duplicate;
        }

        public int getSum(List<Integer> numbers){
            int sum = 0;
            for(int num:numbers){
                sum += num;
            }
            return sum;

            }

        public static void main(String[] args){
            List<Integer> numbers = new ArrayList<Integer>();
            for (int i = 1; i < numbers.size() ; i++) {
                numbers.add(i);
            }
                numbers.add(22);

                DuplicateNumber dn = new DuplicateNumber();
            System.out.println("Duplicate Number is : " + dn.findDuplicateNumber(numbers));
            }
        }
