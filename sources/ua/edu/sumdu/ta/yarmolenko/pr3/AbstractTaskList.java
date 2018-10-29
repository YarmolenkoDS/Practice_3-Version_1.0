/*
 * Classname: AbstractTaskList
 *
 * Date: 2018/10/22
 *
 * Author: Dmitrij Yarmolenko
 * E-mail: dsyarmolenko@gmail.com
 *
 */

package ua.edu.sumdu.ta.yarmolenko.pr3;

import ua.edu.sumdu.ta.yarmolenko.pr3.*;

/**
 * Abstract class AbstractTaskList describes the AbstractTaskList data type
 */
public abstract class AbstractTaskList {
    
    public final String START_OF_TASK_TITLE = "[EDUCTR][TA]";

    protected int counterOfTasksInList;
    private int numberOfListsCreated = 0;
    
    public AbstractTaskList() {
        numberOfListsCreated++; 
        this.counterOfTasksInList = 0;
    }

    /**
     * Method to get the number of created task lists
     *
     * @return the number of created task lists
     */	
    public int getNumberOfListsCreated() {
        return numberOfListsCreated;
    }

    /**
     * Method for adding non-unique tasks
     *
     * @param task is an object of type task added to task list
     */    
    abstract void add(Task task);

    /**
     * Method to delete all tasks equal input
     *
     * @param task is an object of type task to be deleted in the task list
     */	    
    abstract void remove(Task task);

    /**
     * Method to get the number of tasks in the current list
     *
     * @return the number of tasks in the current list
     */	    
    public int size() {
        return counterOfTasksInList;
    }

    /**
     * Method to get the task with the specified number
     *
     * @param index is the task number in the list which should be returned (starting from zero)
     * @return the task whose index in the list is equal to the input
     */	    
    abstract Task getTask(int index);
}