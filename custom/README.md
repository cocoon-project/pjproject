customisation of pjsip 2.3 for syprunner
========================================

the master is based on asterisk github repository ( a copy of svn pjsip trunk adapted for asterisk)



guide asterisk pjsip: https://wiki.asterisk.org/wiki/display/AST/Building+and+Installing+pjproject

in a nutshell:

    # cd pjproject

In the pjproject source directory, run the configure script with the options needed for your system:

    # ./configure --prefix=/usr --enable-shared --disable-sound --disable-resample --disable-video --disable-opencore-amr CFLAGS='-O2 -DNDEBUG -fPIC'

A few recommended options are shown. That includes setting a couple important CFLAGS, -O2 for common optimizations and -DNDEBUG to disable debugging code and assertions.
Build pjproject:

    # make dep
    # make
Install pjproject

    # make install

Update shared library links.
    # ldconfig

Verify that pjproject has been installed in the target location by looking for, and finding the various pjproject modules:

    # ldconfig -p | grep pj
	    libpjsua.so (libc6,x86-64) => /usr/lib/libpjsua.so
	    libpjsip.so (libc6,x86-64) => /usr/lib/libpjsip.so
	    libpjsip-ua.so (libc6,x86-64) => /usr/lib/libpjsip-ua.so
	    libpjsip-simple.so (libc6,x86-64) => /usr/lib/libpjsip-simple.so
	    libpjnath.so (libc6,x86-64) => /usr/lib/libpjnath.so
	    libpjmedia.so (libc6,x86-64) => /usr/lib/libpjmedia.so
	    libpjmedia-videodev.so (libc6,x86-64) => /usr/lib/libpjmedia-videodev.so
	    libpjmedia-codec.so (libc6,x86-64) => /usr/lib/libpjmedia-codec.so
	    libpjmedia-audiodev.so (libc6,x86-64) => /usr/lib/libpjmedia-audiodev.so
	    libpjlib-util.so (libc6,x86-64) => /usr/lib/libpjlib-util.so
	    libpj.so (libc6,x86-64) => /usr/lib/libpj.so




# Building Python and Java SWIG Modules
The SWIG modules for Python and Java are built by invoking make and make install manually from pjsip-apps/src/swig directory. The make install will install the Python SWIG module to user’s site-packages directory.

    # cd pjsip-apps/src/swig
    # make
    # make install


# build old pjsua app

    # cd pjsip-apps/src/python
    # make
    # make install



# lua and swig

http://www.swig.org/Doc1.3/Lua.html#Lua_nn4


