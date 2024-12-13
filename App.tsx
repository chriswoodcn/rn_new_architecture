import React from "react";
import { AppRegistry, StyleSheet, Text, View } from "react-native";

const HelloWorld = () => {
  return (
    <View style={styles.container}>
      <Text style={styles.hello}>Hello, World</Text>
      <Text style={styles.description}>This page is rendered by React Native</Text>
    </View>
  );
};
const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
  },
  hello: {
    fontSize: 20,
    textAlign: "center",
    margin: 10,
  },
  description: {
    fontSize: 16,
    textAlign: "center",
    margin: 10,
  },
});

AppRegistry.registerComponent("MyReactNativeApp", () => HelloWorld);
