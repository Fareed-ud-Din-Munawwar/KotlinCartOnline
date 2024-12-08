import SwiftUI

@main
struct iOSApp: App {

	init() {
		startKoin {
			modules(sharedBase())
		}
	}

	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}