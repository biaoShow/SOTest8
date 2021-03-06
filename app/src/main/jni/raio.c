/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
#include <stdio.h>
#include <stdlib.h>
#include <dlfcn.h>
#include <signal.h>

JNIEXPORT jint JNICALL Java_raio_Raio_get_1sum
        (JNIEnv *Env, jclass jcl, jint a, jint b) {
    void *plib; //指向so文件的指针
    typedef int (*FUN_ADD)(int, int);
    FUN_ADD funAdd = NULL;
    plib = dlopen("system/RAIO/lib_android_gcc2.so", RTLD_NOW | RTLD_GLOBAL);
    if (NULL == plib) {
        char *txt = dlerror();
        printf("%s", txt);
        FILE *fp;
        return -10;
    }
    funAdd = dlsym(plib, "get_sum");
    if (NULL == funAdd) {
        return -4;
    }
    return funAdd(a, b);
};
