# java11-reflection-arrays

# preview
In java we have dedicated API to work with arrays.
* `Class`:
   * `public native boolean isArray();`
* `Array`:
    * public static Object newInstance(Class<?> componentType, int length)
    * public static Object newInstance(Class<?> componentType, int... dimensions)
    * public static native int getLength(Object array)
    * public static native Object get(Object array, int index)
    * public static native boolean getX(Object array, int index)
        * X - primitive
    * public static native void set(Object array, int index, Object value)
    * public static native void setX(Object array, int index, boolean z)
        * X - primitive

# project description

## creating

## expanding