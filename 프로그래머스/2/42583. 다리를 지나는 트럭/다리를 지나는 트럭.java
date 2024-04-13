import java.util.*;

class Solution {
	public int solution(int bridgeLength, int weight, int[] truckWeights) {
		int result = 0;
		int bridgeWeight = 0;

		LinkedList<Integer> bridge = new LinkedList<>();
		for (int i = 0; i < bridgeLength; i++) {
			bridge.add(0);
		}

		for (int i = 0; i < truckWeights.length; i++) {
			result++;
            int outTruck = bridge.poll();
            bridgeWeight -= outTruck;
			if (weight < bridgeWeight + truckWeights[i]) {
				bridge.add(0);
				i--;
			} else {
				bridge.add(truckWeights[i]);
                bridgeWeight += truckWeights[i];
			}
		}
		return result + bridgeLength;
	}
}
