import React from 'react'
import { StyleSheet, ScrollView, View } from 'react-native'

import Heading from './Heading'

export default class HelloWorld extends React.Component {
	render() {
		return (
			<View style={ styles.view }>
				<ScrollView>
					<Heading />
				</ScrollView>
			</View>
		)
	}
}

const styles = StyleSheet.create({
	view: {
		height: '100%'
	}
})
