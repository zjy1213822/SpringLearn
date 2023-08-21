package com.atbilibili.springboottestlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestLearnApplication {
      public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int a=0,b=0,he=0;
            a=sum(l1);
            b=sum(l2);
            he=a+b;
            int val;
            ListNode listNode = new ListNode();

            val=he%10;
            listNode.val=val;

            if(he>0){
                he=he/10;
                listNode.next=new ListNode(he%10);
            }

            return listNode;
        }
        private int sum(ListNode l){
            int result=0,temp=0;
            while(l.next!= null){
                temp*=10;
                temp+=l.val;
                l=l.next;
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestLearnApplication.class, args);
    }



}
