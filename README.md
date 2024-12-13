# ReactNative 新架构集成进原生 App

本仓库用作 ReactNative 新架构集成进原生 App 的模板文件

# 主要依赖的版本

```text
# js
node 20.18.1
react-native 0.76.4
react 18.3.1

# android
agp 8.6.0
gradle 8.7.0
kotlin 1.9.24

# ios 待更新
```

# 调试

```shell
npm run start
npm run android
npm run ios
```

# 打包

```shell
# android
# 将react-native项目打成bundle集成到android项目中，使用android项目继续原生操作
npx react-native bundle --platform android --dev false --entry-file index.js --bundle-output android/app/src/main/assets/index.android.bundle --assets-dest android/app/src/main/res/

# ios 待更新
```
