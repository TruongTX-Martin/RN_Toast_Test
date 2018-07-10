
# react-native-mytoast-test

## Getting started

`$ npm install react-native-mytoast-test --save`

### Mostly automatic installation

`$ react-native link react-native-mytoast-test`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-mytoast-test` and add `RNMytoastTest.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNMytoastTest.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.mytoast.test.RNMytoastTestPackage;` to the imports at the top of the file
  - Add `new RNMytoastTestPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-mytoast-test'
  	project(':react-native-mytoast-test').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-mytoast-test/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-mytoast-test')
  	```


## Usage
```javascript
import RNMytoastTest from 'react-native-mytoast-test';

// TODO: What to do with the module?
RNMytoastTest;
```
  