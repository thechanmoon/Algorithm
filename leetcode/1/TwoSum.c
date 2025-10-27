#include <stdlib.h>
#include <stdio.h>

// Define a structure for a hash table entry
typedef struct HashEntry {
    int key;
    int value; // Stores the index
    struct HashEntry* next;
} HashEntry;

// Define a structure for the hash table
typedef struct HashTable {
    HashEntry** buckets;
    int size;
} HashTable;

// Function to create a new hash table
HashTable* createHashTable(int size) {
    HashTable* ht = (HashTable*)malloc(sizeof(HashTable));
    ht->size = size;
    ht->buckets = (HashEntry**)calloc(size, sizeof(HashEntry*));
    return ht;
}

// Hash function
int hash(int key, int size) {
    return abs(key) % size;
}

// Function to insert a key-value pair into the hash table
void insert(HashTable* ht, int key, int value) {
    int index = hash(key, ht->size);
    HashEntry* newEntry = (HashEntry*)malloc(sizeof(HashEntry));
    newEntry->key = key;
    newEntry->value = value;
    newEntry->next = ht->buckets[index];
    ht->buckets[index] = newEntry;
}

// Function to search for a key in the hash table
// Returns the value (index) if found, -1 otherwise
int search(HashTable* ht, int key) {
    int index = hash(key, ht->size);
    HashEntry* current = ht->buckets[index];
    while (current != NULL) {
        if (current->key == key) {
            return current->value;
        }
        current = current->next;
    }
    return -1;
}

// Function to free the hash table memory
void freeHashTable(HashTable* ht) {
    for (int i = 0; i < ht->size; i++) {
        HashEntry* current = ht->buckets[i];
        while (current != NULL) {
            HashEntry* temp = current;
            current = current->next;
            free(temp);
        }
    }
    free(ht->buckets);
    free(ht);
}

// LeetCode Problem 1: Two Sum
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    HashTable* ht = createHashTable(numsSize * 2); // Initial hash table size
    int* result = (int*)malloc(2 * sizeof(int));
    *returnSize = 2;

    for (int i = 0; i < numsSize; i++) {
        int complement = target - nums[i];
        int complement_index = search(ht, complement);

        if (complement_index != -1) {
            result[0] = complement_index;
            result[1] = i;
            freeHashTable(ht);
            return result;
        }
        insert(ht, nums[i], i);
    }

    freeHashTable(ht);
    return NULL; // Should not happen based on problem constraints
}

// Example usage (for testing)
int main() {
    int nums[] = {2, 7, 11, 15};
    int target = 9;
    int numsSize = sizeof(nums) / sizeof(nums[0]);
    int returnSize;

    int* result = twoSum(nums, numsSize, target, &returnSize);

    if (result != NULL) {
        printf("Indices: [%d, %d]\n", result[0], result[1]); // Expected: [0, 1]
        free(result);
    } else {
        printf("No solution found.\n");
    }

    return 0;
}

//gcc -o TwoSum TwoSum.c
//./TwoSum
//g++ -std=c++17 -o TwoSum TwoSum.c