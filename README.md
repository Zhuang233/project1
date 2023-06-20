sudo apt-get install git ccache automake flex lzop bison \
gperf build-essential zip curl zlib1g-dev zlib1g-dev:i386 \
g++-multilib python-networkx libxml2-utils bzip2 libbz2-dev \
libbz2-1.0 libghc-bzlib-dev squashfs-tools pngcrush \
schedtool dpkg-dev liblz4-tool make optipng maven libssl-dev \
pwgen libswitch-perl policycoreutils minicom libxml-sax-base-perl \
libxml-simple-perl bc libc6-dev-i386 lib32ncurses5-dev \
x11proto-core-dev libx11-dev lib32z-dev libgl1-mesa-dev xsltproc unzip


sudo add-apt-repository main
sudo add-apt-repository universe
sudo add-apt-repository restricted
sudo add-apt-repository multiverse 

git clone https://android.googlesource.com/platform/prebuilts/gcc/linux-x86/aarch64/aarch64-linux-android-4.9 toolchain
https://bitbucket.org/UBERTC/aarch64-linux-android-4.9/get/78e5a7be6044.zip

export ANDROID_AARCH64=/home/ubuntu/桌面/Toolchain/google_gcc/aarch64-linux-android-4.9/bin/
export ARCH=arm64
export SUBARCH=arm64
export PATH=$PATH:$ANDROID_AARCH64
export CROSS_COMPILE=aarch64-linux-android-
