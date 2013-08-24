/**
 * 
 */
package com.sm.core.pipeline;

import java.io.Serializable;

/**
 * @author smdeveloper
 * 
 */
public class User implements Serializable {

	// unique user identifier
	private String id;

	// user or system name
	private String name;

	// //////////////
	// Constructor
	// ///////////////
	public User(String id, String name) {
		if (null == id || id.trim().length() == 0)
			throw new IllegalArgumentException(this.getClass()
					+ "[ User id cannot be null. ]");

		if (null == name || name.trim().length() == 0)
			throw new IllegalArgumentException(this.getClass()
					+ "[ User name cannot be null. ]");
		this.id = id;
		this.name = name;

	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
