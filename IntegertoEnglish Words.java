class Solution {
    
    private final String[] ones = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private final String[] belowTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] tens = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    
    private String threeDigitNumberToWords(int num)
    {
        String words = "";
        if(num/100 != 0)
        {
            words += " " + ones[num/100] + " Hundred";
            num = num % 100;
        }
        if(num >= 10 && num < 20)
        {
            words += " " + belowTwenty[num%10];
        }
        else
        {
            if(num/10 != 0)
            {
                words += " " + tens[num/10];
                num = num % 10;
            }
            if(num != 0)
            {
                words += " " + ones[num];
            }  
        }
        return words;
    }
        
    public String numberToWords(int num) {
        if(num == 0)
        {
            return "Zero";
        }
        String words = "";
        int b = 1000000000;
        int m = 1000000;
        int t = 1000;
        
        int temp = num/b;
        if(temp != 0)
        {
            words += threeDigitNumberToWords(temp) + " Billion";
            num = num % b;
        }
        
        temp = num/m;
        if(temp != 0)
        {
            words += threeDigitNumberToWords(temp) + " Million";
            num = num % m;
        }
        
        temp = num/t;
        if(temp != 0)
        {
            words += threeDigitNumberToWords(temp) + " Thousand";
            num = num % t;
        }
        
        words += threeDigitNumberToWords(num);
        return words.trim(); 
    }
}