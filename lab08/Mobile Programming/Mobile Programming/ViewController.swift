//
//  ViewController.swift
//  Mobile Programming
//
//  Created by Pawel on 30/11/2020.
//  Copyright © 2020 example. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

	@IBAction func buttonPress(_ sender: Any) {
		performSegue(withIdentifier: "randomSegueId", sender: nil)
	}

	@IBAction func swipeAction(_ sender: Any) {
		performSegue(withIdentifier: "randomSegueId", sender: nil)
	}
}

