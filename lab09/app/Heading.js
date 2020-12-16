import React from 'react'
import { StyleSheet, Text } from 'react-native'

export default function Heading() {
	return (
		<Text style={ styles.heading }>
			Hello world!
		</Text>
	)
}

const styles = StyleSheet.create({
	heading: {
		fontSize: 50,
		textAlign: 'center',
		padding: '30%',
		color: 'red'
	}
})
