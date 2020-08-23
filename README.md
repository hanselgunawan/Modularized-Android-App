# Standard Modularization

## Steps of Modularization
* Create `Android Library` based on its functionality
<img src="https://imgur.com/wBsindh.png" width="500px" height="350px" />

* Create an Activity and a Layout for each `Android Library`
* Connect those Android Library on `build.gradle:app`

```
dependencies {
    implementation project(':marketplace')
    implementation project(':account')
    ...
    ...
    ...
}
```

* Call it on `MainActivity`
```
tvMainActivity.text = MarketplaceActivity.marketplaceString + "\n" + AccountActivity.accountString
```

## App Demo
<img src="https://imgur.com/waq3pad.png" width="350px" height="650px" />
