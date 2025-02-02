package codingTest;

import java.util.*;

public class KAKAO_표현가능한이진트리_wooseok {
    public List<Integer> solution(long[] numbers) {
        List<Integer> results = new ArrayList<>();

        for (long number : numbers) {
            String binary = Long.toBinaryString(number);// 주어진 숫자를 이진 문자열로 변환
            int treeSize = getTreeSize(binary.length()); // 완전 이진 트리를 만들기 위한 최소한의 노드 개수 계산
            char[] completeTree = createCompleteTree(binary, treeSize);// 완전 이진 트리 형태의 배열을 생성 (부족한 부분은 '0'으로 채움)

            // 표현 가능한 이진 트리인지 검증
            if (isValidBinaryTree(0, treeSize - 1, completeTree)) {
                results.add(1);// 표현 가능
            } else {
                results.add(0);// 표현 불가능
            }
        }

        return results;
    }

    //완전 이진 트리를 만들기 위한 최소 크기 계산
    private int getTreeSize(int length) {
        int size = 1;

        // 완전 이진 트리의 노드 개수는 (2^h - 1) 형태가 되어야 함
        while (size - 1 < length) {
            size *= 2;
        }
        return size - 1;
    }

    //부족한 자리를 0으로 채운 배열 생성 || binary 원본 이진 문자열 /// size   완전 이진 트리의 크기
    private char[] createCompleteTree(String binary, int size) {
        char[] tree = new char[size];
        Arrays.fill(tree, '0'); // 부족한 자리 '0'으로 채우기

        int offset = size - binary.length(); // 앞쪽에 0을 채울 개수

        // 뒤쪽에 원래 이진수를 삽입하여 완전 이진 트리 구조를 맞춤
        for (int i = 0; i < binary.length(); i++) {
            tree[offset + i] = binary.charAt(i);
        }

        return tree;
    }

    // 재귀적으로 표현 가능한 트리인지 확인
    //start  검증할 서브트리의 시작 인덱스 || end    검증할 서브트리의 끝 인덱스 || tree   완전 이진 트리 구조의 문자 배열
    private boolean isValidBinaryTree(int start, int end, char[] tree) {
        if (start > end) return true;   //빈 트리는 항상 유효

        int root = (start + end) / 2;   // 중앙 노드를 루트로 설정

        // 루트가 '0'일 경우, 왼쪽 및 오른쪽 서브트리에 '1'이 있으면 안 됨
        if (tree[root] == '0') {
            for (int i = start; i < root; i++) {
                if (tree[i] == '1') return false;
            }
            for (int i = root + 1; i <= end; i++) {
                if (tree[i] == '1') return false;
            }
        }

        // 왼쪽 서브트리와 오른쪽 서브트리도 동일한 방식으로 검증
        return isValidBinaryTree(start, root - 1, tree) && isValidBinaryTree(root + 1, end, tree);
    }
}
