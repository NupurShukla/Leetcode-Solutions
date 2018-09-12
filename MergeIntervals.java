/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

class IntervalComparator implements Comparator<Interval> 
{ 
     @Override
    public int compare(Interval a, Interval b)
    {
        return a.start-b.start;
    }
} 

class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        
        List<Interval> mergedIntervals = new ArrayList<Interval>();
        Collections.sort(intervals, new IntervalComparator());
        
        if(intervals.size()==0)
        {
            return mergedIntervals;
        }
        
        int s = intervals.get(0).start;
        int e = intervals.get(0).end;
        int i = 1;
        while(i<intervals.size())
        {
            if(intervals.get(i).start <= e)
            {
                e = Math.max(e, intervals.get(i).end);
            }
            else
            {
                mergedIntervals.add(new Interval(s, e));
                s = intervals.get(i).start;
                e = intervals.get(i).end;
            }
            i++; 
        }
        mergedIntervals.add(new Interval(s, e));
        return mergedIntervals;
    }
}