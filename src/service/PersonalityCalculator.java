package service;

public class PersonalityCalculator

{
	public String findYourBrainType(String option)
	{
		int array[]=findAnswers(option);
		int a = array[0]+array[1]+array[2]+array[4]+array[7]+array[9]+array[10]+array[11]+array[13]+array[17]+array[19];
		int b = array[3]+array[5]+array[6]+array[12]+array[14]+array[15]+array[16]+array[18];
		int z = 66-a+b;
		System.out.println("YOUR TOTAL SCORE::"+z);
		if((z>=22)&&(z<=55))
			return "Left-brained ";
		if((z>=56)&&(z<=64))
			return "No clear preference ";
		if((z>=65)&&(z<=100))
             return "Right-brained";
		return "false";		
	}
	
	public int[] findAnswers(String options)
	{
		String ary[]=options.split(",");
		int len = ary.length;
		int array[] = new int[len];
		int i=0;
		for(String str: ary)
		{
			array[i]=Integer.parseInt(str);
			i++;
		}
		
		return array;
	}
	
	}

