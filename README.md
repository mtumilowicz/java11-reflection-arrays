# java11-reflection-arrays

# preview
In java we have dedicated API to work with arrays.
* `Class`:
   * `public native boolean isArray();`
* `Array`:
    * `public static Object newInstance(Class<?> componentType, int length)` - one dimension array
        * 0 < length (otherwise: `NegativeArraySizeException`)
    * `public static Object newInstance(Class<?> componentType, int... dimensions)` - at least one dimension array
        * 0 < number of dimensions <= 255
        * `NegativeArraySizeException` if any dimension < 0
    * `public static native int getLength(Object array)`
        * `IllegalArgumentException` if an object is not an array
    * `public static native Object get(Object array, int index)`
        * `IllegalArgumentException` if an object is not an array
        * `ArrayIndexOutOfBoundsException`: if not `0 <= index < length`
    * `public static native boolean getX(Object array, int index)`
        * `X` - primitive
    * `public static native void set(Object array, int index, Object value)`
        * `IllegalArgumentException` if an object argument is not an array, 
            or if the array component type is primitive and an unwrapping conversion fails
        * `ArrayIndexOutOfBoundsException`: if not `0 <= index < length`
    * `public static native void setX(Object array, int index, boolean z)`
        * `X` - primitive

# project description

## creating

## expanding