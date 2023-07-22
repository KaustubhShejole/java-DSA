package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class JobSequencingProblem {
    /*
    Given an array of jobs where every job has a deadline and profit if the job is finished before the deadline.
    It is also given that every job takes a single unit of time, so the
    minimum possible deadline for any job is 1. Maximize the total profit
    if only one job can be scheduled at a time.
     */
    public static int fill(int[] jobs,int[][] job_pairs,int i)
    {
        for(int j = job_pairs[i][0]-1;j>=0;j--)
        {
            if(jobs[j]== -1)
            {
                return j;
            }
        }
        return -1;
    }
    public static void job_sequencing_problem(int job_pairs[][])
    {
        Arrays.sort(job_pairs,Comparator.comparingDouble(o->o[0]));
        int profit = 0;
        int max_dedline = job_pairs[job_pairs.length-1][0];
        Arrays.sort(job_pairs, Comparator.comparingDouble(o->o[1]));
        int jobs[] = new int[max_dedline];
        for (int i = 0; i < jobs.length; i++) {
            jobs[i] = -1;
        }
        for (int i = job_pairs.length-1;i>=0;i--)
        {
            int fill_index = fill(jobs,job_pairs,i);
            if (fill_index != -1)
            {
                jobs[fill_index] = i;
                profit += job_pairs[i][1];
            }
        }
        for (int i = 0; i < jobs.length; i++) {
            if(jobs[i] != -1){
                System.out.println(job_pairs[jobs[i]][0]+" "+job_pairs[jobs[i]][1]+" at time "+i+" to "+(i+1));
            }
        }
        System.out.println("Maximum Profit Possible = "+profit);
    }

    static class Job{
        int deadline;
        int profit;
        int id;

        Job(int deadline,int profit,int id)
        {
            this.deadline = deadline;
            this.profit = profit;
            this.id = id;
        }
    }

    public static void jobSequencing(int[][] job_pairs)
    {
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i=0;i<job_pairs.length;i++){
            jobs.add(new Job(job_pairs[i][0],job_pairs[i][1],i));
        }
        Collections.sort(jobs,(a,b) -> b.profit - a.profit);
        //descending order of profit
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        //print seq
        System.out.println("Max Jobs = "+seq.size());
        int profit = 0;
        for (int i = 0; i < seq.size(); i++) {
            profit += job_pairs[seq.get(i)][1];
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
        System.out.println("Maximum Profit = "+profit);
    }
    public static void main(String[] args) {
        int job_pairs[][] = {{4,20},{2,10},{1,40}};

//        jobSequencing(job_pairs);
        job_sequencing_problem(job_pairs);
    }
}
