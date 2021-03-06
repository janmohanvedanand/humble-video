/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.ferry;

public class FerryJNI {

  static {
    JNILibrary library = new JNILibrary("humblevideo",
      new Long(Ferry.getMajorVersion()));
    JNILibrary.load("humblevideo", library);
    io.humble.ferry.Ferry.init();
    // This seems nuts, but it works around a Java 1.6 bug where
    // a race condition exists when JNI_NewDirectByteBuffer is called
    // from multiple threads.  See:
    // http://mail.openjdk.java.net/pipermail/hotspot-runtime-dev/2009-January/000382.html
    Buffer buffer = Buffer.make(null, 2);
    java.util.concurrent.atomic.AtomicReference<JNIReference> ref
      = new java.util.concurrent.atomic.AtomicReference<JNIReference>(null);
    buffer.getByteBuffer(0,2, ref);
    JNIReference reference = ref.get();
    reference.delete();
    buffer.delete();
  }

  static void noop()
  {
  }
  /**
   * Internal Only.  Do not call.
   */
  public native static int getMemoryModel();
  /**
   * Internal Only.  Do not call.
   */
  public native static void setMemoryModel(int value);
  

  public final static native long new_AtomicInteger__SWIG_0();
  public final static native long new_AtomicInteger__SWIG_1(int jarg1);
  public final static native void delete_AtomicInteger(long jarg1);
  public final static native int AtomicInteger_get(long jarg1, AtomicInteger jarg1_);
  public final static native void AtomicInteger_set(long jarg1, AtomicInteger jarg1_, int jarg2);
  public final static native int AtomicInteger_getAndSet(long jarg1, AtomicInteger jarg1_, int jarg2);
  public final static native int AtomicInteger_getAndIncrement(long jarg1, AtomicInteger jarg1_);
  public final static native int AtomicInteger_getAndDecrement(long jarg1, AtomicInteger jarg1_);
  public final static native int AtomicInteger_getAndAdd(long jarg1, AtomicInteger jarg1_, int jarg2);
  public final static native int AtomicInteger_incrementAndGet(long jarg1, AtomicInteger jarg1_);
  public final static native int AtomicInteger_decrementAndGet(long jarg1, AtomicInteger jarg1_);
  public final static native int AtomicInteger_addAndGet(long jarg1, AtomicInteger jarg1_, int jarg2);
  public final static native boolean AtomicInteger_compareAndSet(long jarg1, AtomicInteger jarg1_, int jarg2, int jarg3);
  public final static native boolean AtomicInteger_isAtomic(long jarg1, AtomicInteger jarg1_);
  public final static native int RefCounted_acquire(long jarg1, RefCounted jarg1_);
  public final static native int RefCounted_release(long jarg1, RefCounted jarg1_);
  public final static native int RefCounted_getCurrentNativeRefCount(long jarg1, RefCounted jarg1_);
  public final static native int Logger_LEVEL_ERROR_get();
  public final static native int Logger_LEVEL_WARN_get();
  public final static native int Logger_LEVEL_INFO_get();
  public final static native int Logger_LEVEL_DEBUG_get();
  public final static native int Logger_LEVEL_TRACE_get();
  public final static native long Logger_getLogger(String jarg1);
  public final static native long Logger_getStaticLogger(String jarg1);
  public final static native boolean Logger_log(long jarg1, Logger jarg1_, String jarg2, int jarg3, int jarg4, String jarg5);
  public final static native boolean Logger_error(long jarg1, Logger jarg1_, String jarg2, int jarg3, String jarg4);
  public final static native boolean Logger_warn(long jarg1, Logger jarg1_, String jarg2, int jarg3, String jarg4);
  public final static native boolean Logger_info(long jarg1, Logger jarg1_, String jarg2, int jarg3, String jarg4);
  public final static native boolean Logger_debug(long jarg1, Logger jarg1_, String jarg2, int jarg3, String jarg4);
  public final static native boolean Logger_trace(long jarg1, Logger jarg1_, String jarg2, int jarg3, String jarg4);
  public final static native boolean Logger_isPrintStackTrace(long jarg1, Logger jarg1_);
  public final static native void Logger_setPrintStackTrace(long jarg1, Logger jarg1_, boolean jarg2);
  public final static native boolean Logger_isLogging(long jarg1, Logger jarg1_, int jarg2);
  public final static native void Logger_setIsLogging(long jarg1, Logger jarg1_, int jarg2, boolean jarg3);
  public final static native boolean Logger_isGlobalLogging(int jarg1);
  public final static native void Logger_setGlobalIsLogging(int jarg1, boolean jarg2);
  public final static native String Logger_getName(long jarg1, Logger jarg1_);
  public final static native void delete_Logger(long jarg1);
  public final static native long Mutex_make();
  public final static native void Mutex_lock(long jarg1, Mutex jarg1_);
  public final static native void Mutex_unlock(long jarg1, Mutex jarg1_);
  public final static native int Buffer_getBufferSize(long jarg1, Buffer jarg1_);
  public final static native long Buffer_make__SWIG_0(long jarg1, RefCounted jarg1_, int jarg2);
  public final static native int Buffer_getType(long jarg1, Buffer jarg1_);
  public final static native void Buffer_setType(long jarg1, Buffer jarg1_, int jarg2);
  public final static native int Buffer_getTypeSize(int jarg1);
  public final static native int Buffer_getSize(long jarg1, Buffer jarg1_);
  public final static native long Buffer_make__SWIG_1(long jarg1, RefCounted jarg1_, int jarg2, int jarg3, boolean jarg4);
  public final static native java.nio.ByteBuffer Buffer_java_getByteBuffer(long jarg1, Buffer jarg1_, int jarg2, int jarg3);
  public final static native byte[] Buffer_getByteArray(long jarg1, Buffer jarg1_, int jarg2, int jarg3);
  public final static native long Buffer_make__SWIG_2(long jarg1, RefCounted jarg1_, byte[] jarg2, int jarg3, int jarg4);
  public final static native long Buffer_make__SWIG_3(long jarg1, RefCounted jarg1_, java.nio.ByteBuffer jarg2, int jarg3, int jarg4);
  public final static native long RefCountedTester_make__SWIG_0();
  public final static native long RefCountedTester_make__SWIG_1(long jarg1, RefCountedTester jarg1_);
  public final static native long Mutex_SWIGUpcast(long jarg1);
  public final static native long Buffer_SWIGUpcast(long jarg1);
  public final static native long RefCountedTester_SWIGUpcast(long jarg1);
}
