void selectionSort(Fraction[] input)
	{
		for(int i = 0; i < input.length - 1; i++)
		{
			int smallestFrac = i;
			for(int j = i+1; j < input.length; j++)
			{
				if(input[j].compare(input[smallestFrac]) < 0)
						{
							smallestFrac = j;
						}
			}
			swap(input,i,smallestFrac);
		}
	}
