# rn_new_architecture
react-native new architecture template integrate as module in existing app

# main dependency version
```text
node 20.18.1
react-native 0.75.4
react 18.3.1
gradle 8.7.0
kotlin 1.9.0
```

# dev


# bundle
```shell
#android 
#将react-native项目打成bundle集成到android项目中，使用android项目继续原生开发
npx react-native bundle --platform android --dev false --entry-file index.js --bundle-output android/app/src/main/assets/index.android.bundle --assets-dest android/app/src/main/res/
```