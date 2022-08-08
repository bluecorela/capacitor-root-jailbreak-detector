import Foundation

@objc public class RootJailBreakDetector: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
