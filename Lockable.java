/**
 * Design a Java interface called Lockable that includes the following methods:
 * setKey, lock, unlock, and locked.
 * The setKey, lock, and unlock methods take an integer parameter that represents the key.
 * The setKey method establishes the key.
 * The lock and unlock methods lock and unlock the object, but only if the key used is correct.
 * The locked method returns a boolean of true for locked and false for unlocked.
 * A Lockable object is an object whose regular methods are protected: if the object is locked, the methods cannot be invoked.
 * Redesign and implement a version of the Coin class so that it is Lockable.
 */

public interface Lockable {

    public void setKey(int key);
    public void lock(int key);
    public void unlock(int key);
    public boolean locked();
}
