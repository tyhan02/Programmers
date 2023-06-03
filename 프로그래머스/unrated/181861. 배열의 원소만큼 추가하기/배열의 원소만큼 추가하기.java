class Solution {
    public int[] solution(int[] arr) {
        int[] X = new int[0];  // 빈 배열 X 생성

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];  // 현재 원소 값
            int newXLength = X.length + a;  // 새로운 X 배열의 길이 계산
            int[] tempX = new int[newXLength];  // 임시 배열 생성

            // 기존 X 배열의 원소를 tempX로 복사
            for (int j = 0; j < X.length; j++) {
                tempX[j] = X[j];
            }

            // a를 a번 추가하여 tempX에 추가
            for (int k = X.length; k < newXLength; k++) {
                tempX[k] = a;
            }

            X = tempX;  // tempX를 X 배열로 업데이트
        }

        return X;
    }
}