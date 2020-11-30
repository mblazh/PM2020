//
//  NewController.swift
//  Mobile Programming
//
//  Created by Pawel on 30/11/2020.
//  Copyright © 2020 example. All rights reserved.
//

import UIKit

class NewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */
	@IBAction func returnPress(_ sender: Any) {
		dismiss(animated: true, completion: nil)
	}
	
}
