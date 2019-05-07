cmake_minimum_required(VERSION 3.4.1)

add_library( # Sets the name of the library.
            #输出so库的名称
             raio

             # Sets the library as a shared library.
             #设置动态或者静态库
             SHARED

             # Provides a relative path to your source file(s).
             #设置源文件路径
             src/main/jni/raio.c )


find_library(log-lib log )

target_link_libraries( # Specifies the target library.
                       raio
                       ${log-lib} )