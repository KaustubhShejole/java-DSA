package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection
{
    /*
    You are given n activities with their start and end
    times. Select the maximum number of activities that
    can be performed by a single person, assuming that
    a person can only work on a single activity at a time.
    Activities are sorted according to end time.

    start = [10,12,20]
    end = [20,25,30] ans = 2(A0 and A2)

    Similar Problems:
    Disjoint Set, Maximum Meetings in a room
     */

    public static int maximum_activities_possible(int start_times[],int end_times[])
    {
        /*
        Assumption : Activities already sorted on end times.
         */
        int total_number_of_records = start_times.length;
        ArrayList<Integer> activities_index = new ArrayList<>();
        for (int i = 0; i < total_number_of_records; i++) {
            if (activities_index.isEmpty())
            {
                activities_index.add(i);
            }
            else
            {
                if(start_times[i] >= end_times[activities_index.get(activities_index.size()-1)])
                {
                    activities_index.add(i);
                }
            }
        }
        System.out.println(activities_index);
        return activities_index.size();
    }

    public static int maximum_activities_possible1(int start_times[],int end_times[])
    {
        int total_number_of_records = start_times.length;
        int activities[][] = new int[total_number_of_records][3];
        for (int i = 0; i < total_number_of_records; i++) {
            activities[i][0] = i;
            activities[i][1] = start_times[i];
            activities[i][2] = end_times[i];
        }

        //lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


        ArrayList<Integer> activities_index = new ArrayList<>();
        for (int i = 0; i < total_number_of_records; i++) {
            if (activities_index.isEmpty())
            {
                activities_index.add(activities[i][0]);
            }
            else
            {
                if(activities[i][1] >= activities[activities_index.get(activities_index.size()-1)][2])
                {
                    activities_index.add(activities[i][0]);
                }
            }
        }
        System.out.println(activities_index);
        return activities_index.size();
    }

    public static void main(String[] args) {
        int start[] = {0,1,3,5,5,8};
        int end[] = {6,2,4,7,9,9};
        //System.out.println(maximum_activities_possible(start,end));
        System.out.println(maximum_activities_possible1(start,end));
    }
}
