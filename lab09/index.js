import { AppRegistry } from 'react-native'
import React from 'react'

import {name as appName} from './app.json'
import App from './app/App'

function HelloWorld() {
	return <App />
}

AppRegistry.registerComponent(appName, () => HelloWorld)
